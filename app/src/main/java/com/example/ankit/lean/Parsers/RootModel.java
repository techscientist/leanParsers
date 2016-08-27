import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String timezone;
	public String start_time;
	public String privacy;
	public String topic;
	public VersionModel _version;
	public String background_image;
	public CopyrightModel _copyright;
	public int id;
	public String schedule_published_on;
	public String organizer_description;
	public CreatorModel _creator;
	public String location_name;
	public String email;
	public String end_time;
	public String name;
	public String state;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String description;
	public String code_of_conduct;

	public RootModel(ArrayList<Social_linksModel> social_links, String type, String timezone, String start_time, String privacy, String topic, VersionModel version, String background_image, CopyrightModel copyright, int id, String schedule_published_on, String organizer_description, CreatorModel creator, String location_name, String email, String end_time, String name, String state, String logo, Call_for_papersModel call_for_papers, String organizer_name, String description, String code_of_conduct) {

		this.social_links = social_links;
		this.type = type;
		this.timezone = timezone;
		this.start_time = start_time;
		this.privacy = privacy;
		this.topic = topic;
		this._version = version;
		this.background_image = background_image;
		this._copyright = copyright;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.location_name = location_name;
		this.email = email;
		this.end_time = end_time;
		this.name = name;
		this.state = state;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;

	}

}