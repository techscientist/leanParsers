import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String timezone;
	public String start_time;
	public String privacy;
	public VersionModel _version;
	public String type;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String end_time;
	public String logo;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public CreatorModel _creator;
	public String background_image;
	public String name;
	public String description;
	public String location_name;
	public String organizer_description;
	public String topic;
	public String email;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String schedule_published_on, String timezone, String start_time, String privacy, VersionModel version, String type, CopyrightModel copyright, String organizer_name, String end_time, String logo, int id, Call_for_papersModel call_for_papers, String state, CreatorModel creator, String background_image, String name, String description, String location_name, String organizer_description, String topic, String email, String code_of_conduct, ArrayList<Social_linksModel> social_links) {

		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.start_time = start_time;
		this.privacy = privacy;
		this._version = version;
		this.type = type;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.logo = logo;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._creator = creator;
		this.background_image = background_image;
		this.name = name;
		this.description = description;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;

	}

}