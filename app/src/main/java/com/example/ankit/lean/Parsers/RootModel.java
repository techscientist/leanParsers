import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String description;
	public String privacy;
	public String name;
	public String timezone;
	public String code_of_conduct;
	public String start_time;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String email;
	public String organizer_name;
	public String topic;
	public String organizer_description;
	public int id;
	public String background_image;
	public String logo;
	public String end_time;
	public VersionModel _version;

	public RootModel(CopyrightModel copyright, String location_name, Call_for_papersModel call_for_papers, String state, String description, String privacy, String name, String timezone, String code_of_conduct, String start_time, String type, ArrayList<Social_linksModel> social_links, String schedule_published_on, CreatorModel creator, String email, String organizer_name, String topic, String organizer_description, int id, String background_image, String logo, String end_time, VersionModel version) {

		this._copyright = copyright;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.description = description;
		this.privacy = privacy;
		this.name = name;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.type = type;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.email = email;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.id = id;
		this.background_image = background_image;
		this.logo = logo;
		this.end_time = end_time;
		this._version = version;

	}

}