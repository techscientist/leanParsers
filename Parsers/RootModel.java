import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String start_time;
	public String background_image;
	public String privacy;
	public String state;
	public String schedule_published_on;
	public String topic;
	public CreatorModel _creator;
	public String timezone;
	public String type;
	public String email;
	public String logo;
	public String organizer_name;
	public String code_of_conduct;
	public String location_name;
	public String description;
	public String name;
	public String end_time;
	public String organizer_description;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;

	public RootModel(CopyrightModel copyright, String start_time, String background_image, String privacy, String state, String schedule_published_on, String topic, CreatorModel creator, String timezone, String type, String email, String logo, String organizer_name, String code_of_conduct, String location_name, String description, String name, String end_time, String organizer_description, int id, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, VersionModel version) {

		this._copyright = copyright;
		this.start_time = start_time;
		this.background_image = background_image;
		this.privacy = privacy;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._creator = creator;
		this.timezone = timezone;
		this.type = type;
		this.email = email;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.description = description;
		this.name = name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._version = version;

	}

}