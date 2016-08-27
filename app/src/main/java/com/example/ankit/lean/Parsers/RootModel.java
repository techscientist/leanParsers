import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String description;
	public String end_time;
	public String code_of_conduct;
	public String logo;
	public String schedule_published_on;
	public VersionModel _version;
	public String type;
	public String timezone;
	public CreatorModel _creator;
	public String privacy;
	public String state;
	public String start_time;
	public String email;
	public int id;
	public String organizer_description;
	public String topic;
	public String location_name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(Call_for_papersModel call_for_papers, String name, CopyrightModel copyright, String organizer_name, String description, String end_time, String code_of_conduct, String logo, String schedule_published_on, VersionModel version, String type, String timezone, CreatorModel creator, String privacy, String state, String start_time, String email, int id, String organizer_description, String topic, String location_name, String background_image, ArrayList<Social_linksModel> social_links) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.description = description;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.type = type;
		this.timezone = timezone;
		this._creator = creator;
		this.privacy = privacy;
		this.state = state;
		this.start_time = start_time;
		this.email = email;
		this.id = id;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.location_name = location_name;
		this.background_image = background_image;
		this.social_links = social_links;

	}

}