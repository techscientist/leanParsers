import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String background_image;
	public String end_time;
	public String privacy;
	public String start_time;
	public String state;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public int id;
	public String organizer_description;
	public String type;
	public String logo;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String code_of_conduct;
	public String email;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String name;
	public VersionModel _version;

	public RootModel(CopyrightModel copyright, String background_image, String end_time, String privacy, String start_time, String state, String topic, String location_name, CreatorModel creator, int id, String organizer_description, String type, String logo, String schedule_published_on, ArrayList<Social_linksModel> social_links, String description, String code_of_conduct, String email, String timezone, Call_for_papersModel call_for_papers, String organizer_name, String name, VersionModel version) {

		this._copyright = copyright;
		this.background_image = background_image;
		this.end_time = end_time;
		this.privacy = privacy;
		this.start_time = start_time;
		this.state = state;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this.id = id;
		this.organizer_description = organizer_description;
		this.type = type;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.name = name;
		this._version = version;

	}

}