import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String type;
	public String state;
	public int id;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String location_name;
	public String end_time;
	public String logo;
	public VersionModel _version;
	public String name;
	public String privacy;
	public String organizer_description;
	public String timezone;
	public String start_time;
	public String description;
	public String topic;

	public RootModel(String background_image, String code_of_conduct, CreatorModel creator, String type, String state, int id, String schedule_published_on, Call_for_papersModel call_for_papers, CopyrightModel copyright, String organizer_name, ArrayList<Social_linksModel> social_links, String email, String location_name, String end_time, String logo, VersionModel version, String name, String privacy, String organizer_description, String timezone, String start_time, String description, String topic) {

		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.type = type;
		this.state = state;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.email = email;
		this.location_name = location_name;
		this.end_time = end_time;
		this.logo = logo;
		this._version = version;
		this.name = name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.description = description;
		this.topic = topic;

	}

}